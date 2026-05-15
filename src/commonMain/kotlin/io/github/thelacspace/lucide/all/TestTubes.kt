package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 22f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4f, 19.5f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 2f)
                verticalLineToRelative(17.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, -2.5f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 2f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 16f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.TestTubesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubes: ImageVector
    @Composable get() = TestTubesDefinition.asImageVector()
