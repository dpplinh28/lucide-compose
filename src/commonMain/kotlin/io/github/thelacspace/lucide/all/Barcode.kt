package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barcode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
            }
}

public val LucideIcons.All.BarcodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barcode: ImageVector
    @Composable get() = BarcodeDefinition.asImageVector()
