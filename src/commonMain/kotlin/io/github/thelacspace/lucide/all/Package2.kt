package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.76f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.8f, 1.1f)
                lineToRelative(2.23f, 4.479f)
                arcToRelative(2f, 2f, 0f, false, true, .21f, .891f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9.472f)
                arcToRelative(2f, 2f, 0f, false, true, .211f, -.894f)
                lineTo(5.45f, 4.1f)
                arcTo(2f, 2f, 0f, false, true, 7.24f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.054f, 9.013f)
                horizontalLineToRelative(17.893f)
            }
}

public val LucideIcons.All.Package2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package2: ImageVector
    @Composable get() = Package2Definition.asImageVector()
