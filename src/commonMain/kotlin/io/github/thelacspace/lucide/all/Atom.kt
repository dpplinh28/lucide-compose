package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Atom") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.2f, 20.2f)
                curveToRelative(2.04f, -2.03f, .02f, -7.36f, -4.5f, -11.9f)
                curveToRelative(-4.54f, -4.52f, -9.87f, -6.54f, -11.9f, -4.5f)
                curveToRelative(-2.04f, 2.03f, -.02f, 7.36f, 4.5f, 11.9f)
                curveToRelative(4.54f, 4.52f, 9.87f, 6.54f, 11.9f, 4.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.7f, 15.7f)
                curveToRelative(4.52f, -4.54f, 6.54f, -9.87f, 4.5f, -11.9f)
                curveToRelative(-2.03f, -2.04f, -7.36f, -.02f, -11.9f, 4.5f)
                curveToRelative(-4.52f, 4.54f, -6.54f, 9.87f, -4.5f, 11.9f)
                curveToRelative(2.03f, 2.04f, 7.36f, .02f, 11.9f, -4.5f)
                close()
            }
}

public val LucideIcons.All.AtomDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Atom: ImageVector
    @Composable get() = AtomDefinition.asImageVector()
