package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrainCircuit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                arcToRelative(3f, 3f, 0f, true, false, -5.997f, .125f)
                arcToRelative(4f, 4f, 0f, false, false, -2.526f, 5.77f)
                arcToRelative(4f, 4f, 0f, false, false, .556f, 6.588f)
                arcTo(4f, 4f, 0f, true, false, 12f, 18f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 3f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.003f, 5.125f)
                arcTo(3f, 3f, 0f, false, false, 6.401f, 6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.477f, 10.896f)
                arcToRelative(4f, 4f, 0f, false, true, .585f, -.396f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                arcToRelative(4f, 4f, 0f, false, true, -1.967f, -.516f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.BrainCircuitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrainCircuit: ImageVector
    @Composable get() = BrainCircuitDefinition.asImageVector()
