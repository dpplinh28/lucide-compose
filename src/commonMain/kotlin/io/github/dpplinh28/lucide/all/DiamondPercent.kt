package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DiamondPercent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.7f, 10.3f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, 3.41f)
                lineToRelative(7.59f, 7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 3.41f, 0f)
                lineToRelative(7.59f, -7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, -3.41f)
                lineTo(13.7f, 2.71f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, -3.41f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.2f, 9.2f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.5f, 9.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.7f, 14.8f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.DiamondPercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DiamondPercent: ImageVector
    @Composable get() = DiamondPercentDefinition.asImageVector()
