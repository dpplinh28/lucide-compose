package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTube") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5f, 2f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.4f, -1.1f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.4f, 0f, -2.5f, -1.1f, -2.5f, -2.5f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 2f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 16f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.TestTubeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTube: ImageVector
    @Composable get() = TestTubeDefinition.asImageVector()
