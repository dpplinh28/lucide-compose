package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
