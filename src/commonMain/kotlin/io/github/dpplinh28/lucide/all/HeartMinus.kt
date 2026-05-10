package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.876f, 18.99f)
                lineToRelative(-1.368f, 1.323f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, .019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 9.591f, -3.676f)
                arcToRelative(.56f, .56f, 0f, false, false, .818f, 0f)
                arcTo(5.49f, 5.49f, 0f, false, true, 22f, 9.5f)
                arcToRelative(5.2f, 5.2f, 0f, false, true, -.244f, 1.572f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.HeartMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartMinus: ImageVector
    @Composable get() = HeartMinusDefinition.asImageVector()
