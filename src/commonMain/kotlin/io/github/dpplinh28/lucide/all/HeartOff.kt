package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f, 4.893f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 1.091f, .931f)
                arcToRelative(.56f, .56f, 0f, false, false, .818f, 0f)
                arcTo(5.49f, 5.49f, 0f, false, true, 22f, 9.5f)
                curveToRelative(0f, 1.872f, -1.002f, 3.356f, -2.187f, 4.655f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.967f, 16.967f)
                lineToRelative(-3.459f, 3.346f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, .019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 2.747f, -4.761f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.HeartOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartOff: ImageVector
    @Composable get() = HeartOffDefinition.asImageVector()
