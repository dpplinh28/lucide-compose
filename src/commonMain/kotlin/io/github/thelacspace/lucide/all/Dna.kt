package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 16f)
                lineToRelative(1.5f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 8f)
                lineToRelative(-1.5f, -1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                curveToRelative(-1.798f, 1.998f, -2.518f, 3.995f, -2.807f, 5.993f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 10.5f)
                lineToRelative(1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 6f)
                lineToRelative(-2.891f, -2.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 15f)
                curveToRelative(6.667f, -6f, 13.333f, 0f, 20f, -6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 9f)
                lineToRelative(.891f, .891f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.109f, 14.109f)
                lineTo(4f, 15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.5f, 12.5f)
                lineToRelative(1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 18f)
                lineToRelative(2.891f, 2.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 22f)
                curveToRelative(1.798f, -1.998f, 2.518f, -3.995f, 2.807f, -5.993f)
            }
}

public val LucideIcons.All.DnaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dna: ImageVector
    @Composable get() = DnaDefinition.asImageVector()
