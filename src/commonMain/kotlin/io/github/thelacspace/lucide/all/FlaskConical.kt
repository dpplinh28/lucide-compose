package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, .245f, .96f)
                lineToRelative(5.51f, 10.08f)
                arcTo(2f, 2f, 0f, false, true, 18f, 22f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.755f, -2.96f)
                lineToRelative(5.51f, -10.08f)
                arcTo(2f, 2f, 0f, false, false, 10f, 8f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453f, 15f)
                horizontalLineToRelative(11.094f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 2f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.FlaskConicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConical: ImageVector
    @Composable get() = FlaskConicalDefinition.asImageVector()
