package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 15f)
                lineToRelative(6f, 6f)
                moveToRelative(-6f, -6f)
                verticalLineToRelative(4.8f)
                moveToRelative(0f, -4.8f)
                horizontalLineToRelative(4.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19.8f)
                verticalLineTo(15f)
                moveToRelative(0f, 0f)
                horizontalLineTo(4.2f)
                moveTo(9f, 15f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 4.2f)
                verticalLineTo(9f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.8f)
                moveTo(15f, 9f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 4.2f)
                verticalLineTo(9f)
                moveToRelative(0f, 0f)
                horizontalLineTo(4.2f)
                moveTo(9f, 9f)
                lineTo(3f, 3f)
            }
}

public val LucideIcons.All.ShrinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrink: ImageVector
    @Composable get() = ShrinkDefinition.asImageVector()
