package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.479f, 19.374f)
                lineToRelative(-.971f, .939f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, .019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 9.591f, -3.676f)
                arcToRelative(.56f, .56f, 0f, false, false, .818f, 0f)
                arcTo(5.49f, 5.49f, 0f, false, true, 22f, 9.5f)
                arcToRelative(5.2f, 5.2f, 0f, false, true, -.219f, 1.49f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.HeartPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartPlus: ImageVector
    @Composable get() = HeartPlusDefinition.asImageVector()
