package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading5") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17.7f)
                curveToRelative(.4f, .2f, .8f, .3f, 1.3f, .3f)
                curveToRelative(1.5f, 0f, 2.7f, -1.1f, 2.7f, -2.5f)
                reflectiveCurveTo(19.8f, 13f, 18.3f, 13f)
                horizontalLineTo(17f)
            }
}

public val LucideIcons.All.Heading5Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading5: ImageVector
    @Composable get() = Heading5Definition.asImageVector()
