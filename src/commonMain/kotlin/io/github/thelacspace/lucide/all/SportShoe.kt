package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SportShoe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 10.42f)
                lineToRelative(4.8f, -5.07f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 22f)
                lineTo(21.414f, 9.415f)
                arcTo(2f, 2f, 0f, false, false, 21.2f, 6.4f)
                lineToRelative(-5.61f, -4.208f)
                arcTo(1f, 1f, 0f, false, false, 14f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.394f, 1.906f)
                lineTo(8.677f, 8.053f)
                arcTo(1f, 1f, 0f, false, false, 8f, 9f)
                curveToRelative(-.155f, 6.393f, -2.082f, 9f, -4f, 9f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.SportShoeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SportShoe: ImageVector
    @Composable get() = SportShoeDefinition.asImageVector()
