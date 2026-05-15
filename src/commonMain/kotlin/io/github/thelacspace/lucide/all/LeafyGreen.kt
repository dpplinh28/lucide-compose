package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LeafyGreen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                curveToRelative(1.25f, -.987f, 2.27f, -1.975f, 3.9f, -2.2f)
                arcToRelative(5.56f, 5.56f, 0f, false, true, 3.8f, 1.5f)
                arcToRelative(4f, 4f, 0f, false, false, 6.187f, -2.353f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.69f, -5.116f)
                arcTo(3.5f, 3.5f, 0f, false, false, 20.95f, 8f)
                arcTo(3.5f, 3.5f, 0f, true, false, 16f, 3.05f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -5.831f, 1.373f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -5.116f, 3.69f)
                arcToRelative(4f, 4f, 0f, false, false, -2.348f, 6.155f)
                curveTo(3.499f, 15.42f, 4.409f, 16.712f, 4.2f, 18.1f)
                curveTo(3.926f, 19.743f, 3.014f, 20.732f, 2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                lineTo(17f, 7f)
            }
}

public val LucideIcons.All.LeafyGreenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LeafyGreen: ImageVector
    @Composable get() = LeafyGreenDefinition.asImageVector()
